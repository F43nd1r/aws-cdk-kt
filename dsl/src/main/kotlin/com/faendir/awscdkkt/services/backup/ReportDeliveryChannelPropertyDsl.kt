package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnReportPlan

@Generated
public
    fun reportDeliveryChannelProperty(initializer: CfnReportPlan.ReportDeliveryChannelProperty.Builder.() -> Unit
    = {}): CfnReportPlan.ReportDeliveryChannelProperty =
    CfnReportPlan.ReportDeliveryChannelProperty.builder().apply(initializer).build()
