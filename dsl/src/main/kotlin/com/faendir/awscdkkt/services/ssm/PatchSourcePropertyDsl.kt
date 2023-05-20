@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

public
    fun patchSourceProperty(initializer: CfnPatchBaseline.PatchSourceProperty.Builder.() -> Unit):
    CfnPatchBaseline.PatchSourceProperty =
    CfnPatchBaseline.PatchSourceProperty.builder().apply(initializer).build()
