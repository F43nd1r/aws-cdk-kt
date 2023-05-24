package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.RepositoryImage

@Generated
public fun buildRepositoryImage(imageName: String, initializer: @AwsCdkDsl
    RepositoryImage.Builder.() -> Unit): RepositoryImage =
    RepositoryImage.Builder.create(imageName).apply(initializer).build()
