package com.faendir.awscdkkt.generated.pipelines

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions

@Generated
public fun buildExternalDockerCredentialOptions(initializer: @AwsCdkDsl
    ExternalDockerCredentialOptions.Builder.() -> Unit = {}): ExternalDockerCredentialOptions =
    ExternalDockerCredentialOptions.Builder().apply(initializer).build()
