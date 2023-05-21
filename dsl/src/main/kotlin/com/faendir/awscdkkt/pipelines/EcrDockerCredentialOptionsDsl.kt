package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.EcrDockerCredentialOptions

@Generated
public fun ecrDockerCredentialOptions(initializer: EcrDockerCredentialOptions.Builder.() -> Unit =
    {}): EcrDockerCredentialOptions =
    EcrDockerCredentialOptions.builder().apply(initializer).build()
