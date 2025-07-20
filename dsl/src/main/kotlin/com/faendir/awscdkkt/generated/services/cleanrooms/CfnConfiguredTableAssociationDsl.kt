package com.faendir.awscdkkt.generated.services.cleanrooms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociation
import software.amazon.awscdk.services.cleanrooms.CfnConfiguredTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfiguredTableAssociation(
  id: String,
  props: CfnConfiguredTableAssociationProps,
  initializer: @AwsCdkDsl CfnConfiguredTableAssociation.() -> Unit = {},
): CfnConfiguredTableAssociation = CfnConfiguredTableAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnConfiguredTableAssociation(id: String, initializer: @AwsCdkDsl CfnConfiguredTableAssociation.Builder.() -> Unit = {}): CfnConfiguredTableAssociation = CfnConfiguredTableAssociation.Builder.create(this, id).apply(initializer).build()
