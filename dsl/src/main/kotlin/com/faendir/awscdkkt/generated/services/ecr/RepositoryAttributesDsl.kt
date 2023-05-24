package com.faendir.awscdkkt.generated.services.ecr

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.RepositoryAttributes

@Generated
public fun buildRepositoryAttributes(initializer: @AwsCdkDsl
    RepositoryAttributes.Builder.() -> Unit): RepositoryAttributes =
    RepositoryAttributes.Builder().apply(initializer).build()
