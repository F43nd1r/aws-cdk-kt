package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

@Generated
public
    fun applicationResourceLifecycleConfigProperty(initializer: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit
    = {}): CfnApplication.ApplicationResourceLifecycleConfigProperty =
    CfnApplication.ApplicationResourceLifecycleConfigProperty.builder().apply(initializer).build()
