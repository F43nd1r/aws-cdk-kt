package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.RepositoryProps

@Generated
public fun repositoryProps(initializer: RepositoryProps.Builder.() -> Unit = {}): RepositoryProps =
    RepositoryProps.builder().apply(initializer).build()
