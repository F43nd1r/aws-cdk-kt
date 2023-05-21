package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@Generated
public
    fun targetResourceProperty(initializer: CfnResourceSet.TargetResourceProperty.Builder.() -> Unit
    = {}): CfnResourceSet.TargetResourceProperty =
    CfnResourceSet.TargetResourceProperty.builder().apply(initializer).build()
