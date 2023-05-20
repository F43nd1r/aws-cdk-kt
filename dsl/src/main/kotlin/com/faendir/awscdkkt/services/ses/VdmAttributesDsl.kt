@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.VdmAttributes
import software.amazon.awscdk.services.ses.VdmAttributesProps
import software.constructs.Construct

public fun Construct.vdmAttributes(id: String, initializer: VdmAttributes.() -> Unit = {}):
    VdmAttributes = VdmAttributes(this, id).apply(initializer)

public fun Construct.vdmAttributes(
  id: String,
  props: VdmAttributesProps,
  initializer: VdmAttributes.() -> Unit = {},
): VdmAttributes = VdmAttributes(this, id, props).apply(initializer)
