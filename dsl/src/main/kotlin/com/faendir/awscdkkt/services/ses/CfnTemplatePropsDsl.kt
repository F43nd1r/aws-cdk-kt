package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnTemplateProps

@Generated
public fun cfnTemplateProps(initializer: CfnTemplateProps.Builder.() -> Unit = {}): CfnTemplateProps
    = CfnTemplateProps.builder().apply(initializer).build()
