package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ApplicationConfiguration

@Generated
public fun applicationConfiguration(initializer: ApplicationConfiguration.Builder.() -> Unit = {}):
    ApplicationConfiguration = ApplicationConfiguration.builder().apply(initializer).build()
