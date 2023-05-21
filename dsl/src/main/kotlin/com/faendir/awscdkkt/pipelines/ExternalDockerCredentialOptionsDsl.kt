package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions

@Generated
public
    fun externalDockerCredentialOptions(initializer: ExternalDockerCredentialOptions.Builder.() -> Unit
    = {}): ExternalDockerCredentialOptions =
    ExternalDockerCredentialOptions.builder().apply(initializer).build()
