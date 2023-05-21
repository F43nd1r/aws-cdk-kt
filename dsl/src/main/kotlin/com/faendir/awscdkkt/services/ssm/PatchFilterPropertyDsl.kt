package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@Generated
public fun patchFilterProperty(initializer: CfnPatchBaseline.PatchFilterProperty.Builder.() -> Unit
    = {}): CfnPatchBaseline.PatchFilterProperty =
    CfnPatchBaseline.PatchFilterProperty.builder().apply(initializer).build()
