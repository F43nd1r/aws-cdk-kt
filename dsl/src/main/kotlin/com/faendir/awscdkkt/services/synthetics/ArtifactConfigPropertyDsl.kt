@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

public fun artifactConfigProperty(initializer: CfnCanary.ArtifactConfigProperty.Builder.() -> Unit):
    CfnCanary.ArtifactConfigProperty =
    CfnCanary.ArtifactConfigProperty.builder().apply(initializer).build()
