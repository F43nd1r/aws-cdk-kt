package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnDocument

@Generated
public
    fun documentRequiresProperty(initializer: CfnDocument.DocumentRequiresProperty.Builder.() -> Unit
    = {}): CfnDocument.DocumentRequiresProperty =
    CfnDocument.DocumentRequiresProperty.builder().apply(initializer).build()
