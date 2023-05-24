package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.RepositoryImage
import software.amazon.awscdk.services.ecs.RepositoryImageProps

@Generated
public fun repositoryImage(imageName: String): RepositoryImage = RepositoryImage(imageName)

@Generated
public fun repositoryImage(imageName: String, props: RepositoryImageProps): RepositoryImage =
    RepositoryImage(imageName, props)

@Generated
public fun buildRepositoryImage(imageName: String, initializer: @AwsCdkDsl
    RepositoryImage.Builder.() -> Unit): RepositoryImage =
    RepositoryImage.Builder.create(imageName).apply(initializer).build()
