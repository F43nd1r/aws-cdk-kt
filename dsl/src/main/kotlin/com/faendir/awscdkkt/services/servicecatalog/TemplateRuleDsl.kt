package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.TemplateRule

@Generated
public fun templateRule(initializer: TemplateRule.Builder.() -> Unit = {}): TemplateRule =
    TemplateRule.builder().apply(initializer).build()
