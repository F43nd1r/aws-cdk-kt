package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun artifactConfigProperty(initializer: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit =
    {}): CfnCanary.ArtifactConfigProperty =
    CfnCanary.ArtifactConfigProperty.builder().apply(initializer).build()
