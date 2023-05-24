package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnCidrCollection
import software.amazon.awscdk.services.route53.CfnCidrCollectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCidrCollection(id: String, props: CfnCidrCollectionProps): CfnCidrCollection
    = CfnCidrCollection(this, id, props)

@Generated
public fun Construct.cfnCidrCollection(
  id: String,
  props: CfnCidrCollectionProps,
  initializer: @AwsCdkDsl CfnCidrCollection.() -> Unit,
): CfnCidrCollection = CfnCidrCollection(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCidrCollection(id: String, initializer: @AwsCdkDsl
    CfnCidrCollection.Builder.() -> Unit): CfnCidrCollection =
    CfnCidrCollection.Builder.create(this, id).apply(initializer).build()
