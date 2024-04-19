package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

@Generated
public fun buildImagePullSecretProperty(initializer: @AwsCdkDsl
    CfnJobDefinition.ImagePullSecretProperty.Builder.() -> Unit = {}):
    CfnJobDefinition.ImagePullSecretProperty =
    CfnJobDefinition.ImagePullSecretProperty.Builder().apply(initializer).build()
