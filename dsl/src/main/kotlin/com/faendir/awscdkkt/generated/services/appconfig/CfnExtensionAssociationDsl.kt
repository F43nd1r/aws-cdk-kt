package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociation
import software.amazon.awscdk.services.appconfig.CfnExtensionAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExtensionAssociation(id: String, initializer: @AwsCdkDsl
    CfnExtensionAssociation.() -> Unit = {}): CfnExtensionAssociation =
    CfnExtensionAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnExtensionAssociation(
  id: String,
  props: CfnExtensionAssociationProps,
  initializer: @AwsCdkDsl CfnExtensionAssociation.() -> Unit = {},
): CfnExtensionAssociation = CfnExtensionAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnExtensionAssociation(id: String, initializer: @AwsCdkDsl
    CfnExtensionAssociation.Builder.() -> Unit = {}): CfnExtensionAssociation =
    CfnExtensionAssociation.Builder.create(this, id).apply(initializer).build()
