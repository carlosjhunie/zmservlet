
package zimbramail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for syncFolder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="syncFolder">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:zimbraMail}folder">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="tag" type="{urn:zimbraMail}tagIdsAttr"/>
 *           &lt;element name="c" type="{urn:zimbraMail}convIdsAttr"/>
 *           &lt;element name="chat" type="{urn:zimbraMail}chatIdsAttr"/>
 *           &lt;element name="m" type="{urn:zimbraMail}msgIdsAttr"/>
 *           &lt;element name="cn" type="{urn:zimbraMail}contactIdsAttr"/>
 *           &lt;element name="appt" type="{urn:zimbraMail}apptIdsAttr"/>
 *           &lt;element name="task" type="{urn:zimbraMail}taskIdsAttr"/>
 *           &lt;element name="notes" type="{urn:zimbraMail}noteIdsAttr"/>
 *           &lt;element name="w" type="{urn:zimbraMail}wikiIdsAttr"/>
 *           &lt;element name="doc" type="{urn:zimbraMail}docIdsAttr"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "syncFolder", propOrder = {
    "tagOrCOrChat"
})
public class SyncFolder
    extends Folder
{

    @XmlElements({
        @XmlElement(name = "tag", type = TagIdsAttr.class),
        @XmlElement(name = "c", type = ConvIdsAttr.class),
        @XmlElement(name = "chat", type = ChatIdsAttr.class),
        @XmlElement(name = "m", type = MsgIdsAttr.class),
        @XmlElement(name = "cn", type = ContactIdsAttr.class),
        @XmlElement(name = "appt", type = ApptIdsAttr.class),
        @XmlElement(name = "task", type = TaskIdsAttr.class),
        @XmlElement(name = "notes", type = NoteIdsAttr.class),
        @XmlElement(name = "w", type = WikiIdsAttr.class),
        @XmlElement(name = "doc", type = DocIdsAttr.class)
    })
    protected List<IdsAttr> tagOrCOrChat;

    /**
     * Gets the value of the tagOrCOrChat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tagOrCOrChat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTagOrCOrChat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagIdsAttr }
     * {@link ConvIdsAttr }
     * {@link ChatIdsAttr }
     * {@link MsgIdsAttr }
     * {@link ContactIdsAttr }
     * {@link ApptIdsAttr }
     * {@link TaskIdsAttr }
     * {@link NoteIdsAttr }
     * {@link WikiIdsAttr }
     * {@link DocIdsAttr }
     * 
     * 
     */
    public List<IdsAttr> getTagOrCOrChat() {
        if (tagOrCOrChat == null) {
            tagOrCOrChat = new ArrayList<IdsAttr>();
        }
        return this.tagOrCOrChat;
    }

}
