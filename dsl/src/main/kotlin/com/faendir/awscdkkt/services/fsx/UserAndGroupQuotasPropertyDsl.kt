package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public
    fun userAndGroupQuotasProperty(initializer: CfnVolume.UserAndGroupQuotasProperty.Builder.() -> Unit
    = {}): CfnVolume.UserAndGroupQuotasProperty =
    CfnVolume.UserAndGroupQuotasProperty.builder().apply(initializer).build()
