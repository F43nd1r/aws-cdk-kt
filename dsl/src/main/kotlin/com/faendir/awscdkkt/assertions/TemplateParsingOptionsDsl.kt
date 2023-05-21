package com.faendir.awscdkkt.assertions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.assertions.TemplateParsingOptions

@Generated
public fun templateParsingOptions(initializer: TemplateParsingOptions.Builder.() -> Unit = {}):
    TemplateParsingOptions = TemplateParsingOptions.builder().apply(initializer).build()
