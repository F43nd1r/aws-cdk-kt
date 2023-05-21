package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.RepositoryTriggerOptions

@Generated
public fun repositoryTriggerOptions(initializer: RepositoryTriggerOptions.Builder.() -> Unit = {}):
    RepositoryTriggerOptions = RepositoryTriggerOptions.builder().apply(initializer).build()
