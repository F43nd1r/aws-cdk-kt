@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.servicecatalogappregistry

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
import software.constructs.Construct

public fun Construct.cfnAttributeGroup(
  id: String,
  props: CfnAttributeGroupProps,
  initializer: CfnAttributeGroup.() -> Unit = {},
): CfnAttributeGroup = CfnAttributeGroup(this, id, props).apply(initializer)
