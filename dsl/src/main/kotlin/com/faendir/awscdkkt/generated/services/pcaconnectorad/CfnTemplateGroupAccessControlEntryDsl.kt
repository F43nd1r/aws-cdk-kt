package com.faendir.awscdkkt.generated.services.pcaconnectorad

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTemplateGroupAccessControlEntry(
  id: String,
  props: CfnTemplateGroupAccessControlEntryProps,
  initializer: @AwsCdkDsl CfnTemplateGroupAccessControlEntry.() -> Unit = {},
): CfnTemplateGroupAccessControlEntry = CfnTemplateGroupAccessControlEntry(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTemplateGroupAccessControlEntry(id: String, initializer: @AwsCdkDsl
    CfnTemplateGroupAccessControlEntry.Builder.() -> Unit = {}): CfnTemplateGroupAccessControlEntry
    = CfnTemplateGroupAccessControlEntry.Builder.create(this, id).apply(initializer).build()
