package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps
import software.constructs.Construct

@Generated
public fun Construct.tagOptions(id: String, props: TagOptionsProps): TagOptions = TagOptions(this,
    id, props)

@Generated
public fun Construct.tagOptions(
  id: String,
  props: TagOptionsProps,
  initializer: @AwsCdkDsl TagOptions.() -> Unit,
): TagOptions = TagOptions(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTagOptions(id: String, initializer: @AwsCdkDsl
    TagOptions.Builder.() -> Unit): TagOptions = TagOptions.Builder.create(this,
    id).apply(initializer).build()
