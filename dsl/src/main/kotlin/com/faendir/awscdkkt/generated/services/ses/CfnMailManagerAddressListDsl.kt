package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnMailManagerAddressList
import software.amazon.awscdk.services.ses.CfnMailManagerAddressListProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMailManagerAddressList(id: String, initializer: @AwsCdkDsl CfnMailManagerAddressList.() -> Unit = {}): CfnMailManagerAddressList = CfnMailManagerAddressList(this, id).apply(initializer)

@Generated
public fun Construct.cfnMailManagerAddressList(
  id: String,
  props: CfnMailManagerAddressListProps,
  initializer: @AwsCdkDsl CfnMailManagerAddressList.() -> Unit = {},
): CfnMailManagerAddressList = CfnMailManagerAddressList(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMailManagerAddressList(id: String, initializer: @AwsCdkDsl CfnMailManagerAddressList.Builder.() -> Unit = {}): CfnMailManagerAddressList = CfnMailManagerAddressList.Builder.create(this, id).apply(initializer).build()
