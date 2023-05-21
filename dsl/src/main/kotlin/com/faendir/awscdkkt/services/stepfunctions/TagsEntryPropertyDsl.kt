package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@Generated
public fun tagsEntryProperty(initializer: CfnStateMachine.TagsEntryProperty.Builder.() -> Unit =
    {}): CfnStateMachine.TagsEntryProperty =
    CfnStateMachine.TagsEntryProperty.builder().apply(initializer).build()
