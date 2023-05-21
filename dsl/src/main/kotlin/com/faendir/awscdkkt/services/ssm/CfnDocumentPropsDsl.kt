package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnDocumentProps

@Generated
public fun cfnDocumentProps(initializer: CfnDocumentProps.Builder.() -> Unit = {}): CfnDocumentProps
    = CfnDocumentProps.builder().apply(initializer).build()
