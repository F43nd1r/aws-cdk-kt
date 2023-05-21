package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.RepositoryAttributes

@Generated
public fun repositoryAttributes(initializer: RepositoryAttributes.Builder.() -> Unit = {}):
    RepositoryAttributes = RepositoryAttributes.builder().apply(initializer).build()
