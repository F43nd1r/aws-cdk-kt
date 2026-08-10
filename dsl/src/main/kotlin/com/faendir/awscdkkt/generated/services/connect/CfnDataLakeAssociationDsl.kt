package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnDataLakeAssociation
import software.amazon.awscdk.services.connect.CfnDataLakeAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataLakeAssociation(
  id: String,
  props: CfnDataLakeAssociationProps,
  initializer: @AwsCdkDsl CfnDataLakeAssociation.() -> Unit = {},
): CfnDataLakeAssociation = CfnDataLakeAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataLakeAssociation(id: String, initializer: @AwsCdkDsl CfnDataLakeAssociation.Builder.() -> Unit = {}): CfnDataLakeAssociation = CfnDataLakeAssociation.Builder.create(this, id).apply(initializer).build()
