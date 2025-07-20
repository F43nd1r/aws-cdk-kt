package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnIntegrationAssociation
import software.amazon.awscdk.services.connect.CfnIntegrationAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIntegrationAssociation(
  id: String,
  props: CfnIntegrationAssociationProps,
  initializer: @AwsCdkDsl CfnIntegrationAssociation.() -> Unit = {},
): CfnIntegrationAssociation = CfnIntegrationAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIntegrationAssociation(id: String, initializer: @AwsCdkDsl CfnIntegrationAssociation.Builder.() -> Unit = {}): CfnIntegrationAssociation = CfnIntegrationAssociation.Builder.create(this, id).apply(initializer).build()
