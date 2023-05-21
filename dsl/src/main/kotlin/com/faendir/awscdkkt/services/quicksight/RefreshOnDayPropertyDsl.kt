package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnRefreshSchedule

@Generated
public
    fun refreshOnDayProperty(initializer: CfnRefreshSchedule.RefreshOnDayProperty.Builder.() -> Unit
    = {}): CfnRefreshSchedule.RefreshOnDayProperty =
    CfnRefreshSchedule.RefreshOnDayProperty.builder().apply(initializer).build()
