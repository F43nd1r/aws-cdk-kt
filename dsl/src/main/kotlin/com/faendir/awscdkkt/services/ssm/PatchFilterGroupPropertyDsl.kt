package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnPatchBaseline

@Generated
public
    fun patchFilterGroupProperty(initializer: CfnPatchBaseline.PatchFilterGroupProperty.Builder.() -> Unit
    = {}): CfnPatchBaseline.PatchFilterGroupProperty =
    CfnPatchBaseline.PatchFilterGroupProperty.builder().apply(initializer).build()
