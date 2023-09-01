package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.OptionGroupProps
import software.constructs.Construct

@Generated
public fun Construct.optionGroup(
  id: String,
  props: OptionGroupProps,
  initializer: @AwsCdkDsl OptionGroup.() -> Unit = {},
): OptionGroup = OptionGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildOptionGroup(id: String, initializer: @AwsCdkDsl
    OptionGroup.Builder.() -> Unit = {}): OptionGroup = OptionGroup.Builder.create(this,
    id).apply(initializer).build()
