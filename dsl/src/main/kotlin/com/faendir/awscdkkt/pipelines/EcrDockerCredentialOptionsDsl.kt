@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions

public fun ecrDockerCredentialOptions(initializer: EcrDockerCredentialOptions.Builder.() -> Unit):
    EcrDockerCredentialOptions = EcrDockerCredentialOptions.builder().apply(initializer).build()
