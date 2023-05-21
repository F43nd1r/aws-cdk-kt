package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@Generated
public fun patchSourceProperty(initializer: CfnPatchBaseline.PatchSourceProperty.Builder.() -> Unit
    = {}): CfnPatchBaseline.PatchSourceProperty =
    CfnPatchBaseline.PatchSourceProperty.builder().apply(initializer).build()
