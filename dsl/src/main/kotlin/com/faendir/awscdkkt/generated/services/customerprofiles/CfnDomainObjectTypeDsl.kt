package com.faendir.awscdkkt.generated.services.customerprofiles

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.customerprofiles.CfnDomainObjectType
import software.amazon.awscdk.services.customerprofiles.CfnDomainObjectTypeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDomainObjectType(
  id: String,
  props: CfnDomainObjectTypeProps,
  initializer: @AwsCdkDsl CfnDomainObjectType.() -> Unit = {},
): CfnDomainObjectType = CfnDomainObjectType(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDomainObjectType(id: String, initializer: @AwsCdkDsl CfnDomainObjectType.Builder.() -> Unit = {}): CfnDomainObjectType = CfnDomainObjectType.Builder.create(this, id).apply(initializer).build()
