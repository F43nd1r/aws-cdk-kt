package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun jobExecutionsRetryConfigProperty(initializer: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.JobExecutionsRetryConfigProperty =
    CfnJobTemplate.JobExecutionsRetryConfigProperty.builder().apply(initializer).build()
