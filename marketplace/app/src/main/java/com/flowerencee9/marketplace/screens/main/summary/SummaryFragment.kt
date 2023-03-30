package com.flowerencee9.marketplace.screens.main.summary

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.flowerencee9.marketplace.R
import com.flowerencee9.marketplace.databinding.FragmentReserveBinding
import com.flowerencee9.marketplace.screens.transaction.detail.TransactionDetailActivity
import com.flowerencee9.marketplace.support.classes.TParentAdapter
import com.flowerencee9.marketplace.support.sealed.Trx
import com.flowerencee9.marketplace.support.utils.snackBar

class SummaryFragment : Fragment() {

    companion object {
        private val TAG = SummaryFragment::class.java.simpleName
    }

    private var _binding : FragmentReserveBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<SummaryViewModel>()

    private val waitingAdapter: TParentAdapter by lazy {
        TParentAdapter { parent ->
            startActivity(TransactionDetailActivity.myIntent(requireContext(), parent.tId, Trx.WAITING.value))
        }
    }

    private val progressAdapter: TParentAdapter by lazy {
        TParentAdapter { parent ->
            startActivity(TransactionDetailActivity.myIntent(requireContext(), parent.tId, Trx.PROGRESS.value))
        }
    }

    private val finishedAdapter: TParentAdapter by lazy {
        TParentAdapter { parent ->
            startActivity(TransactionDetailActivity.myIntent(requireContext(), parent.tId, Trx.FINISHED.value))
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReserveBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupView()
    }

    override fun onResume() {
        super.onResume()
        initRequest()
        initLogic()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initRequest() {
        viewModel.getSummary()
    }

    private fun initLogic() {
        with(viewModel){
            loadingStates.observe(viewLifecycleOwner){
                Log.d(TAG, "loading $it")
            }
            tProgress.observe(viewLifecycleOwner){
                progressAdapter.setData(it)
            }
            tWaiting.observe(viewLifecycleOwner){
                waitingAdapter.setData(it)
            }
            tFinished.observe(viewLifecycleOwner){
                finishedAdapter.setData(it)
            }
        }
    }

    private fun setupView() {
        with(binding){
            tbToolbar.apply {
                setTitle(getString(R.string.book_request))
            }
            rvWaiting.apply {
                adapter = waitingAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
            rvFinished.apply {
                adapter = finishedAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
            rvProgress.apply {
                adapter = progressAdapter
                layoutManager = LinearLayoutManager(requireContext())
            }
            btnAction.setOnClickListener {
                /*startActivity(TransactionsActivity.myIntent(requireContext()))*/
                root.snackBar("Not Implemented")
            }
        }
    }
}