package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.VdmAttributes
import software.amazon.awscdk.services.ses.VdmAttributesProps
import software.constructs.Construct

@Generated
public fun Construct.vdmAttributes(id: String, initializer: VdmAttributes.() -> Unit = {}):
    VdmAttributes = VdmAttributes(this, id).apply(initializer)

@Generated
public fun Construct.vdmAttributes(
  id: String,
  props: VdmAttributesProps,
  initializer: VdmAttributes.() -> Unit = {},
): VdmAttributes = VdmAttributes(this, id, props).apply(initializer)
