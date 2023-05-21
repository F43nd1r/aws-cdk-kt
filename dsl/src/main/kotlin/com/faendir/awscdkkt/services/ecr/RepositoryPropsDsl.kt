package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.RepositoryProps

@Generated
public fun repositoryProps(initializer: RepositoryProps.Builder.() -> Unit = {}): RepositoryProps =
    RepositoryProps.builder().apply(initializer).build()
