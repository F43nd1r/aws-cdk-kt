package com.faendir.awscdkkt.generated.services.servicecatalogappregistry

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroup
import software.amazon.awscdk.services.servicecatalogappregistry.CfnAttributeGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAttributeGroup(
  id: String,
  props: CfnAttributeGroupProps,
  initializer: @AwsCdkDsl CfnAttributeGroup.() -> Unit = {},
): CfnAttributeGroup = CfnAttributeGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAttributeGroup(id: String, initializer: @AwsCdkDsl
    CfnAttributeGroup.Builder.() -> Unit = {}): CfnAttributeGroup =
    CfnAttributeGroup.Builder.create(this, id).apply(initializer).build()
