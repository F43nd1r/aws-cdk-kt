@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ExternalDockerCredentialOptions

public
    fun externalDockerCredentialOptions(initializer: ExternalDockerCredentialOptions.Builder.() -> Unit):
    ExternalDockerCredentialOptions =
    ExternalDockerCredentialOptions.builder().apply(initializer).build()
