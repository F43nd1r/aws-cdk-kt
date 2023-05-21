package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnReportPlan

@Generated
public fun reportSettingProperty(initializer: CfnReportPlan.ReportSettingProperty.Builder.() -> Unit
    = {}): CfnReportPlan.ReportSettingProperty =
    CfnReportPlan.ReportSettingProperty.builder().apply(initializer).build()
