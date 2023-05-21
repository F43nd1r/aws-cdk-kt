package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.BuildEnvironmentCertificate

@Generated
public fun buildEnvironmentCertificate(initializer: BuildEnvironmentCertificate.Builder.() -> Unit =
    {}): BuildEnvironmentCertificate =
    BuildEnvironmentCertificate.builder().apply(initializer).build()
