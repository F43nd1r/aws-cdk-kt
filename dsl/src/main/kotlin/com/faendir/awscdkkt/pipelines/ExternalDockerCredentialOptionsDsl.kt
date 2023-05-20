@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions

public
    fun externalDockerCredentialOptions(initializer: ExternalDockerCredentialOptions.Builder.() -> Unit):
    ExternalDockerCredentialOptions =
    ExternalDockerCredentialOptions.builder().apply(initializer).build()
