package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet

@Generated
public
    fun dNSTargetResourceProperty(initializer: CfnResourceSet.DNSTargetResourceProperty.Builder.() -> Unit
    = {}): CfnResourceSet.DNSTargetResourceProperty =
    CfnResourceSet.DNSTargetResourceProperty.builder().apply(initializer).build()
