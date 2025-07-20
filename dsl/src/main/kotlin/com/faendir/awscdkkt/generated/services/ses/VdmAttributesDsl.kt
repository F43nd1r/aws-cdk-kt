package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.VdmAttributes
import software.amazon.awscdk.services.ses.VdmAttributesProps
import software.constructs.Construct

@Generated
public fun Construct.vdmAttributes(id: String, initializer: @AwsCdkDsl VdmAttributes.() -> Unit = {}): VdmAttributes = VdmAttributes(this, id).apply(initializer)

@Generated
public fun Construct.vdmAttributes(
  id: String,
  props: VdmAttributesProps,
  initializer: @AwsCdkDsl VdmAttributes.() -> Unit = {},
): VdmAttributes = VdmAttributes(this, id, props).apply(initializer)

@Generated
public fun Construct.buildVdmAttributes(id: String, initializer: @AwsCdkDsl VdmAttributes.Builder.() -> Unit = {}): VdmAttributes = VdmAttributes.Builder.create(this, id).apply(initializer).build()
