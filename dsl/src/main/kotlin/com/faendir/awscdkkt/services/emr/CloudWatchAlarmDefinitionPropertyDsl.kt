package com.faendir.awscdkkt.services.emr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@Generated
public
    fun cloudWatchAlarmDefinitionProperty(initializer: CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.Builder.() -> Unit
    = {}): CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty =
    CfnInstanceGroupConfig.CloudWatchAlarmDefinitionProperty.builder().apply(initializer).build()
