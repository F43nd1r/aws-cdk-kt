package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

@Generated
public
    fun applicationVersionLifecycleConfigProperty(initializer: CfnApplication.ApplicationVersionLifecycleConfigProperty.Builder.() -> Unit
    = {}): CfnApplication.ApplicationVersionLifecycleConfigProperty =
    CfnApplication.ApplicationVersionLifecycleConfigProperty.builder().apply(initializer).build()
